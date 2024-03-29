# Thirds-management-API How to initialize

## 1. Clone the repository
```
https://github.com/AlejFernandezV/thirds-management.git  
```

## 2. Configurate file called "application.properties", this file is en the folder called "resource"

```
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.datasource.url=jdbc:mysql:`url and name of database`
spring.datasource.username=`SU username database`
spring.datasource.password=`SU passwords`
```


## 3. Create the database in MySQL

### Script

```
-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `thirds-management`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `thirds`
--

CREATE TABLE `thirds` (
  `th_id` bigint(20) NOT NULL,
  `th_address` varchar(255) DEFAULT NULL,
  `th_city` varchar(255) DEFAULT NULL,
  `th_country` varchar(255) DEFAULT NULL,
  `th_created_at` date DEFAULT NULL,
  `th_email` varchar(255) DEFAULT NULL,
  `ent_id` bigint(20) DEFAULT NULL,
  `th_gender` varchar(255) DEFAULT NULL,
  `th_id_number` bigint(20) DEFAULT NULL,
  `th_last_names` varchar(255) DEFAULT NULL,
  `th_names` varchar(255) DEFAULT NULL,
  `th_person_type` tinyint(4) DEFAULT NULL,
  `th_phone_number` varchar(255) DEFAULT NULL,
  `th_photo_path` varchar(255) DEFAULT NULL,
  `th_province` varchar(255) DEFAULT NULL,
  `th_ruth_path` varchar(255) DEFAULT NULL,
  `th_social_reason` varchar(255) DEFAULT NULL,
  `th_state` varchar(255) DEFAULT NULL,
  `th_updated_at` date DEFAULT NULL,
  `th_verification_number` bigint(20) DEFAULT NULL,
  `ti_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `thirds_and_type`
--

CREATE TABLE `thirds_and_type` (
  `th_id` bigint(20) NOT NULL,
  `tt_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `third_type`
--

CREATE TABLE `third_type` (
  `tt_id` bigint(20) NOT NULL,
  `tt_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `third_type`
--

INSERT INTO `third_type` (`tt_id`, `tt_name`) VALUES
(1, 'Cliente'),
(2, 'Proveedor'),
(3, 'Empleado'),
(4, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `type_id`
--

CREATE TABLE `type_id` (
  `ti_id` varchar(255) NOT NULL,
  `ti_name` varchar(255) DEFAULT NULL,
  `ti_created_at` date DEFAULT NULL,
  `ti_updated_at` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `type_id`
--

INSERT INTO `type_id` (`ti_id`, `ti_name`, `ti_created_at`, `ti_updated_at`) VALUES
('CC', 'Cédula de Ciudadanía', NULL, NULL),
('CE', 'Cédula de Extranjería', NULL, NULL),
('NIT', 'Número de Identificación Tributaria', NULL, NULL),
('Pasaporte', 'Pasaporte', NULL, NULL),
('TI', 'Tarjeta de Identidad', NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `thirds`
--
ALTER TABLE `thirds`
  ADD PRIMARY KEY (`th_id`),
  ADD KEY `FK5d0mfsotavgi2aecf6fc2yiav` (`ti_id`);

--
-- Indices de la tabla `thirds_and_type`
--
ALTER TABLE `thirds_and_type`
  ADD PRIMARY KEY (`th_id`,`tt_id`),
  ADD KEY `FKiya9sjgv63bwgjq7rbgds2yhi` (`tt_id`);

--
-- Indices de la tabla `third_type`
--
ALTER TABLE `third_type`
  ADD PRIMARY KEY (`tt_id`);

--
-- Indices de la tabla `type_id`
--
ALTER TABLE `type_id`
  ADD PRIMARY KEY (`ti_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `thirds`
--
ALTER TABLE `thirds`
  MODIFY `th_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `thirds`
--
ALTER TABLE `thirds`
  ADD CONSTRAINT `FK5d0mfsotavgi2aecf6fc2yiav` FOREIGN KEY (`ti_id`) REFERENCES `type_id` (`ti_id`);

--
-- Filtros para la tabla `thirds_and_type`
--
ALTER TABLE `thirds_and_type`
  ADD CONSTRAINT `FKiya9sjgv63bwgjq7rbgds2yhi` FOREIGN KEY (`tt_id`) REFERENCES `third_type` (`tt_id`),
  ADD CONSTRAINT `FKl1udub58o564itnvgp0egkxu7` FOREIGN KEY (`th_id`) REFERENCES `thirds` (`th_id`);
COMMIT;
```

# End Points

## Create (POST)
    - .../th_api/thirds
##### JSON petition Example
```
{
    "entId": 1234567,
    "typeId": "CC",
    "thirdTypes":["Cliente","Proveedor"],
    "rutPath": "",
    "personType":"Natural",
    "names": "Juan",
    "lastNames": "Pérez",
    "socialReason": null,
    "gender": "Masculino",
    "idNumber": 1234567890,
    "verificationNumber": 1,
    "state": true,
    "photoPath": "/path/to/photo.jpg",
    "country": "Colombia",
    "province": "Antioquia",
    "city": "Medellín",
    "address": "Calle 123 #45-67",
    "phoneNumber": "1234567",
    "email": "juan.perez@example.com",
    "creationDate": "2024-03-15",
    "updateDate": "2024-03-15"
}
```

## List (GET)
    - .../th_api/thirds

##### JSON petition example
```
{
    "entId": 12345,
    "numPage": 0
}

```

##### JSON response example
```
{
  "content": [
    {
      "thId": 8,
      "entId": 12345,
      "typeId": "CC",
      "thirdTypes": null,
      "rutPath": "",
      "personType": "Natural",
      "names": "Juan",
      "lastNames": "Pérez",
      "socialReason": null,
      "gender": "Masculino",
      "idNumber": 1234567890,
      "verificationNumber": 1,
      "state": true,
      "photoPath": "/path/to/photo.jpg",
      "country": "Colombia",
      "province": "Antioquia",
      "city": "Medellín",
      "address": "Calle 123 #45-67",
      "phoneNumber": "1234567",
      "email": "juan.perez@example.com",
      "creationDate": "2024-03-15",
      "updateDate": "2024-03-15"
    }
  ],
  "pageable": {
    "pageNumber": 0,
    "pageSize": 10,
    "sort": {
      "empty": true,
      "sorted": false,
      "unsorted": true
    },
    "offset": 0,
    "paged": true,
    "unpaged": false
  },
  "last": true,
  "totalElements": 1,
  "totalPages": 1,
  "size": 10,
  "number": 0,
  "sort": {
    "empty": true,
    "sorted": false,
    "unsorted": true
  },
  "numberOfElements": 1,
  "first": true,
  "empty": false
}
```

## Get By
TO DO
##### JSON Schema
```
    TO DO
```

## Change State
TO DO
##### JSON Schema
```
    TO DO
```