--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements
USE rest_services_db;
INSERT INTO `rest_services_db`.`user` (`id`, `first_name`, `last_name`, `password`, `registration_status`, `token`, `username`) VALUES ('1', 'Xavier', 'Ramirez', '', 'CONFIRMED', '', 'xaviercobain88');
INSERT INTO `rest_services_db`.`license_plan` (`id`, `description`, `price`, `status`, `total_companies`, `total_users`) VALUES ('1', 'Plan Básico', '47', 'ACTIVE', '5', '1');
INSERT INTO `rest_services_db`.`license` (`id`, `used_companies`, `used_users`, `license_plan_id`) VALUES ('1', '0', '0', '1');
INSERT INTO `rest_services_db`.`license_user` (`id`, `license_id`, `user_id`) VALUES ('1', '1', '1');
INSERT INTO `company` VALUES (1,NULL,'1718263153','Esta es una razon social',1);
INSERT INTO `assigment` VALUES (1,1);
INSERT INTO `rest_services_db`.`account` (`id`, `account_type`, `code`, `description`, `name`) VALUES ('1', 'ASSETS', '1', '1', '1');
INSERT INTO `rest_services_db`.`account` (`id`, `account_type`, `code`, `description`, `name`, `parent_account_id`) VALUES ('2', 'ASSETS', '2', '2', '2', '1');
INSERT INTO `rest_services_db`.`account` (`id`, `account_type`, `code`, `description`, `name`, `parent_account_id`) VALUES ('3', 'ASSETS', '3', '3', '3', '2');
