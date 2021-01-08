-- Creating the database

CREATE SCHEMA `familytree` ;

-- Creating the tables

CREATE TABLE `familytree`.`person` (
  `personID` INT NOT NULL,
  `person_name` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `dob` DATE NOT NULL,
  `birth_place_id` INT NOT NULL,
  `death_date` DATE NULL,
  `death_place_id` INT NULL,
  `is_married` BOOLEAN NOT NULL DEFAULT false,
  `has_children` BOOLEAN NOT NULL DEFAULT false,
  PRIMARY KEY (`personID`));

CREATE TABLE `familytree`.`children` (
  `personID` INT NOT NULL,
  `motherID` INT NOT NULL,
  `fatherID` INT NOT NULL,
  PRIMARY KEY (`personID`));

CREATE TABLE `familytree`.`marriage` (
  `marriageID` INT NOT NULL,
  `marriageDate` DATE NOT NULL,
  `marriagePlaceID` INT NOT NULL,
  `husbandID` INT NOT NULL,
  `wifeID` INT NOT NULL,
  PRIMARY KEY (`marriageID`));

CREATE TABLE `familytree`.`place` (
  `placeID` INT NOT NULL,
  `placeAddress` VARCHAR(45) NOT NULL,
  `placePostcode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`placeID`));


-- Addition of Information into Databases

INSERT INTO `place` (`placeID`, `place_address`, `place_postcode`) VALUES ('010', 'Glasgow', 'PA3 2ST');
INSERT INTO `place` (`placeID`, `place_address`, `place_postcode`) VALUES ('020', 'Manchester', 'WA14 4PE');
INSERT INTO `place` (`placeID`, `place_address`, `place_postcode`) VALUES ('030', 'London', 'LU2 LPY');
INSERT INTO `place` (`placeID`, `place_address`, `place_postcode`) VALUES ('040', 'Hull', 'HU6 7RX');

INSERT INTO `person` (`personID`, `person_name`, `sex`, `dob`, `birth_place_id`, `death_date`, `death_place_id`, `is_married`, `has_children`) VALUES ('001', 'Bill Walsh', 'Male', '1967/10/10', '10', '2019/08/20', '20', 1, 1);
INSERT INTO `person` (`personID`, `person_name`, `sex`, `dob`, `birth_place_id`, `death_date`, `death_place_id`, `is_married`, `has_children`) VALUES ('002', 'Alice Walsh', 'Female', '1970/06/04', '30', '2010/02/10', '20', 1, 1);
INSERT INTO `person` (`personID`, `person_name`, `sex`, `dob`, `birth_place_id`, `is_married`, `has_children`) VALUES ('003', 'Linda Stevenson', 'Female', '1998/09/01', '40', 1, 0);
INSERT INTO `person` (`personID`, `person_name`, `sex`, `dob`, `birth_place_id`, `is_married`, `has_children`) VALUES ('004', 'Josh Stevenson', 'Male', '1992/02/15', '40', 1, 0);
INSERT INTO `person` (`personID`, `person_name`, `sex`, `dob`, `birth_place_id`, `is_married`, `has_children`) VALUES ('005', 'Simon Walsh', 'Male', '1995/07/13', '40', 0, 0);


INSERT INTO `familytree`.`marriage` (`marriageID`, `marriage_date`, `marriage_placeid`, `husbandid`, `wifeid`) VALUES ('001', '1990/10/02', '030', '001', '002');
INSERT INTO `familytree`.`marriage` (`marriageID`, `marriage_date`, `marriage_placeid`, `husbandid`, `wifeid`) VALUES ('002', '2020/10/02', '040', '004', '003');



INSERT INTO `familytree`.`children` (`personID`, `motherID`, `fatherID`) VALUES ('003', '002', '001');
INSERT INTO `familytree`.`children` (`personID`, `motherID`, `fatherID`) VALUES ('005', '002', '001');
