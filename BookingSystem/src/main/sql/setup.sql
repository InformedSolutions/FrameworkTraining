DROP TABLE IF EXISTS `bookingsystem`.`appointments`;
DROP TABLE IF EXISTS `bookingsystem`.`clients`;
DROP TABLE IF EXISTS `bookingsystem`.`providers`;

DROP SCHEMA IF EXISTS `bookingsystem`;

CREATE SCHEMA `bookingsystem` ;

CREATE TABLE `bookingsystem`.`appointments` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `startDateTime` DATETIME NOT NULL,
  `endDateTime` DATETIME NOT NULL,
  `provider` VARCHAR(45) NOT NULL,
  `client` VARCHAR(45) NOT NULL,
  `cost` DOUBLE NOT NULL,
  `description` VARCHAR(45) NULL,
  `hasClientMissedAppointments` TINYINT NULL DEFAULT 1,
  PRIMARY KEY (`id`));

CREATE TABLE `bookingsystem`.`clients` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phoneNumber` VARCHAR(45) NOT NULL,
  `emailAddress` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `bookingsystem`.`providers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `areaOfExpertise` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `bookingsystem`.`providers` (`id`, `name`, `areaOfExpertise`) VALUES ('1', 'Luke Armstrong', 'Dentistry');
INSERT INTO `bookingsystem`.`providers` (`id`, `name`, `areaOfExpertise`) VALUES ('2', 'Austen Wells', 'Acupuncture');
INSERT INTO `bookingsystem`.`providers` (`id`, `name`, `areaOfExpertise`) VALUES ('3', 'Sarah Swallow', 'Physiotherapy');

INSERT INTO `bookingsystem`.`clients` (`id`, `name`, `address`, `phoneNumber`, `emailAddress`) VALUES ('4', 'Rachel Gaffney', 'Informed Solutions, Altrincham', '12345', 'rachel.gaffney@informed.com');
INSERT INTO `bookingsystem`.`clients` (`id`, `name`, `address`, `phoneNumber`, `emailAddress`) VALUES ('5', 'James Soi', 'James\' House, Nottingham', '6789', 'james.soi@informed.com');
INSERT INTO `bookingsystem`.`clients` (`id`, `name`, `address`, `phoneNumber`, `emailAddress`) VALUES ('6', 'John Hunt', '12 Framework Training Road', '3456', 'john.hunt@framework.com');

INSERT INTO `bookingsystem`.`appointments` (`id`, `startDateTime`, `endDateTime`, `provider`, `client`, `cost`, `description`, `hasClientMissedAppointments`) VALUES ('7', '2021-01-11 10:30:00', '2021-01-11 11:30:00', 'Austen Wells', 'Rachel Gaffney', '120.00', 'Has missed appointments before', '1');
INSERT INTO `bookingsystem`.`appointments` (`id`, `startDateTime`, `endDateTime`, `provider`, `client`, `cost`, `hasClientMissedAppointments`) VALUES ('8', '2021-01-12 09:15:00', '2021-01-12 11:00:00', 'Sarah Swallow', 'James Soi', '80.00', '0');
INSERT INTO `bookingsystem`.`appointments` (`id`, `startDateTime`, `endDateTime`, `provider`, `client`, `cost`, `hasClientMissedAppointments`) VALUES ('9', '2021-01-13 13:20:00', '2021-01-13 14:00:00', 'Luke Armstrong', 'John Hunt', '65.00', '0');
