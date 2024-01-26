-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-01-2024 a las 21:02:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `visual`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarUsuarioYEmpleado` (IN `p_correo` VARCHAR(100), IN `p_contrasenia` VARCHAR(100), IN `p_primerNombre` VARCHAR(35), IN `p_segundoNombre` VARCHAR(35), IN `p_primerApellido` VARCHAR(35), IN `p_segundoApellido` VARCHAR(35))   BEGIN
    DECLARE usuario_existente INT;
    DECLARE empleado_existente INT;

    -- Verificar si el usuario existe en la tabla usuarios
    SELECT COUNT(*) INTO usuario_existente FROM usuarios WHERE correo = p_correo;

    IF usuario_existente > 0 THEN
        -- Actualizar contraseña en la tabla usuarios
        UPDATE usuarios SET contrasenia = p_contrasenia WHERE correo = p_correo;
    ELSE
        -- El usuario no existe, podrías manejar esto según tu lógica de negocio
        -- Por ejemplo, podrías lanzar un error, registrar un nuevo usuario, etc.
        SELECT 'Usuario no encontrado';
    END IF;

    -- Verificar si el empleado existe en la tabla empleados
    SELECT COUNT(*) INTO empleado_existente FROM empleados WHERE correo = p_correo;

    IF empleado_existente > 0 THEN
        -- Actualizar campos de nombre y apellido en la tabla empleados
        UPDATE empleados 
        SET 
            primerNombre = p_primerNombre,
            segundoNombre = p_segundoNombre,
            primerApellido = p_primerApellido,
            segundoApellido = p_segundoApellido 
        WHERE correo = p_correo;
    ELSE
        -- El empleado no existe, manejar según la lógica de tu aplicación
        SELECT 'Empleado no encontrado';
    END IF;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencias`
--

CREATE TABLE `asistencias` (
  `idAsistencia` int(11) NOT NULL,
  `cedula` char(10) NOT NULL,
  `fecha` date NOT NULL,
  `jornada` varchar(15) NOT NULL,
  `tipoEvento` varchar(10) NOT NULL,
  `hora` time NOT NULL,
  `tipoAsistencia` varchar(20) NOT NULL,
  `minutosAtraso` int(11) NOT NULL,
  `multa` double(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asistencias`
--

INSERT INTO `asistencias` (`idAsistencia`, `cedula`, `fecha`, `jornada`, `tipoEvento`, `hora`, `tipoAsistencia`, `minutosAtraso`, `multa`) VALUES
(1, '2222', '2023-12-27', 'Mañana', 'Entrada', '07:55:00', 'A Tiempo', 0, 0.00),
(2, '2222', '2023-12-27', 'Mañana', 'Salida', '12:55:00', 'Salida Temprana', 5, 1.25),
(3, '2222', '2023-12-27', 'Tarde', 'Entrada', '14:10:00', 'Atrasado', 10, 2.50),
(4, '2222', '2023-12-27', 'Tarde', 'Salida', '16:55:00', 'Salida Temprana', 5, 1.25),
(5, '2222', '2023-12-28', 'Mañana', 'Entrada', '07:59:00', 'A Tiempo', 0, 0.00),
(6, '2222', '2023-12-28', 'Mañana', 'Salida', '13:01:00', 'A tiempo', 0, 0.00),
(7, '2222', '2023-12-28', 'Tarde', 'Entrada', '14:10:00', 'Atrasado', 10, 2.50),
(8, '2222', '2023-12-28', 'Tarde', 'Salida', '17:05:00', 'A tiempo', 0, 0.00);

--
-- Disparadores `asistencias`
--
DELIMITER $$
CREATE TRIGGER `calcular_tipo_asistencia` BEFORE INSERT ON `asistencias` FOR EACH ROW BEGIN
    DECLARE hora_limite_entradaManana TIME;
    DECLARE hora_limite_salidaManana TIME;
    DECLARE hora_limite_entradaTarde TIME;
    DECLARE hora_limite_salidaTarde TIME;
    DECLARE hora_entrada TIME;
    DECLARE tipo_evento VARCHAR(10);
    
    SET hora_limite_entradaManana = '08:00:00';
    SET hora_limite_salidaManana =  '13:00:00';
    SET hora_limite_entradaTarde = '14:00:00';
    SET hora_limite_salidaTarde = '17:00:00';
    
    SET hora_entrada = NEW.hora;
    SET tipo_evento = NEW.tipoEvento;
    
    IF ((hora_entrada >= '07:45:00' AND hora_entrada < '08:00:00') OR (hora_entrada = '08:00:00' AND tipo_evento = 'Entrada'))
        OR ((hora_entrada >= '13:45:00' AND hora_entrada < '14:00:00') OR (hora_entrada = '14:00:00' AND tipo_evento = 'Entrada')) THEN
        SET NEW.tipoAsistencia = 'A Tiempo';
        SET NEW.multa = 0;
	SET NEW.minutosAtraso = 0;
    
    ELSEIF (hora_entrada > '08:00:00' AND hora_entrada <= '13:00:00' AND tipo_evento = 'Entrada') THEN
        SET NEW.tipoAsistencia = 'Atrasado';
        SET NEW.multa = LEAST(TIMESTAMPDIFF(MINUTE, hora_limite_entradaManana , hora_entrada) * 0.25, 10);
	SET NEW.minutosAtraso = TIMESTAMPDIFF(MINUTE, hora_limite_entradaManana , hora_entrada);
    
    ELSEIF (hora_entrada > '14:00:00' AND hora_entrada <= '17:00:00' AND tipo_evento = 'Entrada') THEN
        SET NEW.tipoAsistencia = 'Atrasado';
        SET NEW.multa = LEAST(TIMESTAMPDIFF(MINUTE, hora_limite_entradaTarde , hora_entrada) * 0.25, 10);
	SET NEW.minutosAtraso =TIMESTAMPDIFF(MINUTE, hora_limite_entradaTarde , hora_entrada);
    
    ELSEIF (tipo_evento = 'Salida' AND hora_entrada >= '08:00:00' AND hora_entrada <= '13:00:00') THEN
        SET NEW.tipoAsistencia = 'Salida Temprana';
        SET NEW.multa = LEAST(TIMESTAMPDIFF(MINUTE, hora_entrada, hora_limite_salidaManana) * 0.25, 10);
	SET NEW.minutosAtraso =  TIMESTAMPDIFF(MINUTE, hora_entrada, hora_limite_salidaManana); 

    ELSEIF (tipo_evento = 'Salida' AND hora_entrada >= '14:00:00' AND hora_entrada <= '17:00:00') THEN
        SET NEW.tipoAsistencia = 'Salida Temprana';
        SET NEW.multa = LEAST(TIMESTAMPDIFF(MINUTE, hora_entrada, hora_limite_salidaTarde) * 0.25, 10);
	SET NEW.minutosAtraso = TIMESTAMPDIFF(MINUTE, hora_entrada, hora_limite_salidaTarde);

    ELSE 
	SET NEW.tipoAsistencia = "A tiempo";
	SET NEW.multa = 0;
	SET NEW.minutosAtraso = 0;
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `determinar_jornada` BEFORE INSERT ON `asistencias` FOR EACH ROW BEGIN
    IF (NEW.hora >= '07:45:00' AND NEW.hora < '13:15:00') THEN
        SET NEW.jornada = "Mañana"; -- Mañana
    ELSEIF (NEW.hora >= '13:45:00' AND NEW.hora < '17:15:00') THEN
        SET NEW.jornada = "Tarde"; -- Tarde
    ELSE
        SET NEW.jornada = -1;
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `cedula` char(10) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `primerNombre` varchar(35) NOT NULL,
  `segundoNombre` varchar(35) DEFAULT NULL,
  `primerApellido` varchar(35) NOT NULL,
  `segundoApellido` varchar(35) NOT NULL,
  `sueldo` decimal(10,2) NOT NULL DEFAULT 800.00,
  `idDigital` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`cedula`, `correo`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `sueldo`, `idDigital`) VALUES
('2222', 'eje2@asistency.com', 'Gabriel', 'Leonardo', 'Medina', 'Vasco', 800.00, '01585');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcaasis`
--

CREATE TABLE `marcaasis` (
  `id` int(11) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `marca` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `correo` varchar(100) NOT NULL,
  `contrasenia` varchar(100) NOT NULL,
  `rol` enum('Administrador','Empleado') NOT NULL,
  `estado` enum('Activo','Inactivo') NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`correo`, `contrasenia`, `rol`, `estado`) VALUES
('eje2@asistency.com', '7c9e7c1494b2684ab7c19d6aff737e460fa9e98d5a234da1310c97ddf5691834', 'Administrador', 'Activo'),
('gabo10@asistency.com', 'fa0465be0d706986b685861e4e019037caf1bc063d9be340c6e82291eb3c69b1', 'Administrador', 'Activo');

--
-- Disparadores `usuarios`
--
DELIMITER $$
CREATE TRIGGER `ingresar_admins` BEFORE INSERT ON `usuarios` FOR EACH ROW BEGIN
    IF NEW.rol IS NULL THEN
        SET NEW.rol = 'Administrador';
    END IF;
END
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencias`
--
ALTER TABLE `asistencias`
  ADD PRIMARY KEY (`idAsistencia`),
  ADD KEY `cedula` (`cedula`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`cedula`),
  ADD KEY `correo` (`correo`);

--
-- Indices de la tabla `marcaasis`
--
ALTER TABLE `marcaasis`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistencias`
--
ALTER TABLE `asistencias`
  MODIFY `idAsistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `marcaasis`
--
ALTER TABLE `marcaasis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencias`
--
ALTER TABLE `asistencias`
  ADD CONSTRAINT `asistencias_ibfk_1` FOREIGN KEY (`cedula`) REFERENCES `empleados` (`cedula`);

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`correo`) REFERENCES `usuarios` (`correo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
