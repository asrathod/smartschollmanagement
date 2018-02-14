/* student_information table */
CREATE TABLE `student_information` (
  `student_id` bigint NOT NULL auto_increment,
  `first_name` varchar(100) ,
  `middle_name` varchar(100) ,
  `last_name` varchar(100) ,
  `dob` date,
  `gender` varchar(100),
  `academic_year` varchar(100),
  `current_standard` varchar(100),
  `current_section` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  PRIMARY KEY (`student_id`)
);

/* personal_information table */
CREATE TABLE `personal_information` (
  `personal_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `place_of_birth` varchar(100) ,
  `religion` varchar(100) ,
  `cast` varchar(100) ,
  `sub_cast` varchar(100) ,
  `mother_toungue` varchar(100) ,
  `blood_group` varchar(100) ,
  `id_mark1` varchar(100) ,
  `id_mark2` varchar(100) ,
  `addmision_no` bigint(50),
  `adhar_no` bigint(50),
  `disability_yesno` varchar(100) ,
  `disability_details` varchar(100) ,
  `medical_history` varchar(100) ,
  `medical treatement` varchar(100) ,
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  PRIMARY KEY (`personal_info_id`),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
);

	select * from personal_information;
	insert into student_information(student_id,first_name,middle_name,last_name, dob, gender, academic_year, current_standard, current_section, rec_created_by,rec_updated_by)
	values(1,'And','s','Rat','2017-06-27 00:00:00','Male','2017-2018','I','A',1,1);
	
	insert into personal_information(personal_info_id,student_id,place_of_birth,religion, cast, sub_cast, mother_toungue, blood_group, id_mark1, id_mark2, addmision_no, adhar_no, disability_yesno, disability_details, medical_history, medical_treatement, rec_created_by,rec_updated_by)
	values(1, 1,'Bang','Hindu','GM','GM','Kannada','A+','hg', 'jk', 1234, 5656, 'No', 'ghhh', 'ghhh', 'ghhh', 1,1);

/* user_roles table */
 CREATE TABLE `user_roles` (
	 `role_id`  BIGINT NOT NULL auto_increment,
	 `role_name` varchar(100),
	 PRIMARY KEY (`role_id`)
 	);
 
	insert into user_roles(role_id, role_name)
	values(1, 'Admin');
	
	insert into user_roles(role_id, role_name)
	values(2, 'Director');
	
	insert into user_roles(role_id, role_name)
	values(3, 'Management');
	
	insert into user_roles(role_id, role_name)
	values(4, 'Teaching Staff');
	
	insert into user_roles(role_id, role_name)
	values(5, 'Non-Teaching Staff');
	
/* user_information table */
	CREATE TABLE `user_information` (
	  `user_id` bigint NOT NULL auto_increment,
	  `user_eid` varchar(100) , 
	  `first_name` varchar(100) ,
	  `midile_name` varchar(100) ,
	  `last_name` varchar(100) ,
	  `user_email` varchar(100),
	  `gender` varchar(50),
	  `dob` date,
	  `blood_group` varchar(100) ,
	  `id_mark1` varchar(100) ,
	  `adhar_no` bigint(50),
	  `user_password` varchar(255) ,
	  `password_salt` varchar(255) ,
	  `user_role` bigint NOT NULL,
	  `rec_created_date` datetime DEFAULT current_timestamp,
	  `rec_created_by` bigint NOT NULL DEFAULT 1,
	  `rec_updated_date` datetime DEFAULT current_timestamp,
	  `rec_updated_by` bigint NOT NULL DEFAULT 1,
	  `active_flag` boolean DEFAULT '1',
	  
	  PRIMARY KEY (`user_id`),
	  FOREIGN KEY (`user_role`) REFERENCES user_roles (role_id),
	  
	  UNIQUE (`user_eid`)
	);
	
	ALTER TABLE user_information
	ADD adhar_no varchar(50) after id_mark1;
	ALTER TABLE user_information DROP userId;
 
/* contact_information table */
 CREATE TABLE `contact_information` (
  `contact_info_id` bigint NOT NULL,
  `first_contact_no` varchar(100),
  `street_no_name1` varchar(100),
  `city` varchar(100),
  `State` varchar(100),
  `Country` varchar(100),
  `ZipCode` varchar(100),
  `second_contact_no` varchar(100),
  `street_no_name2` varchar(100),
  `city2` varchar(100),
  `State2` varchar(100),
  `Country2` varchar(100),
  `ZipCode2` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(contact_info_id),
  foreign key(contact_info_id) references student_information(student_id)
  );
  
  /* academic_information table */
  CREATE TABLE `academic_information` (
  `academic_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `status` varchar(100),
  `academic_stream` varchar(100),
  `medium` varchar(100),
  `admission_mode` varchar(100),
  `transport_req` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(academic_info_id),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
  );

  CREATE TABLE `previous_academic_information` (
  `prev_aca_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `dob` date,
  `last_std_studied` varchar(100),
  `leave_reason` varchar(100),
  `comments` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(prev_aca_info_id),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
  );
  
  /* parents_information table */
  CREATE TABLE `parents_information` (
  `parents_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `father_first_name` varchar(100),
  `father_last_name` varchar(100),
  `father_qualifiction` varchar(100),
  `father_employment` varchar(100),
  `father_annual_income` varchar(100),
  `mobile_no1` bigint NOT NULL,
  `mother_first_name` varchar(100),
  `mother_last_name` varchar(100),
  `mother_qualifiction` varchar(100),
  `mother_employment` varchar(100),
  `mother_annual_income` float NOT NULL,
  `mobile_no2` bigint NOT NULL,
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(parents_info_id),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
  );
  
  /* extra_curricular_information */
  CREATE TABLE `extra_curricular_information` (
  `extra_curr_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `sprorts` varchar(100),
  `indoorGame` varchar(100),
  `outdoorGame` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(extra_curr_info_id),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
  );
  
  /* achievements_information */
  CREATE TABLE `achievements_information` (
  `achiev_info_id` bigint NOT NULL auto_increment,
  `student_id` bigint NOT NULL,
  `achievement1` varchar(100),
  `achievement2` varchar(100),
  `achievement3` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(achiev_info_id),
  FOREIGN KEY(`student_id`) REFERENCES `student_information` (`student_id`)
  
  );
  
   /* experience_information */
  CREATE TABLE `experience_information` (
  `exp_info_id` bigint NOT NULL auto_increment,
  `user_id` bigint NOT NULL,
  `year_of_exp` int(20),
  `exp_details1` varchar(100),
  `exp_details2` varchar(100),
  `skills_details1` varchar(100),
  `skills_details2` varchar(100),
  `skills_details3` varchar(100),
  `current_salary` float NOT NULL,
  `previous_salary` float NOT NULL,
  `date_of_joining` date,
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(exp_info_id),
  FOREIGN KEY(`user_id`) REFERENCES `user_information` (`user_id`)
  );
  
/* user_address */
   CREATE TABLE `user_address` (
  `address_id` bigint NOT NULL auto_increment,
  `user_id` bigint NOT NULL, 
  `primary_contact_no` varchar(100),
  `secondary_contact_no` varchar(100),
  `current_street_no_name` varchar(100),
  `current_city` varchar(100),
  `current_State` varchar(100),
  `current_country` varchar(100),
  `current_zip_code` varchar(100),  
  `permanent_street_no_name` varchar(100),
  `permanent_city` varchar(100),
  `permanent_state` varchar(100),
  `permanent_country` varchar(100),
  `permanent_zip_code` varchar(100),
  `rec_created_date` datetime DEFAULT current_timestamp,
  `rec_created_by` bigint NOT NULL DEFAULT 1,
  `rec_updated_date` datetime DEFAULT current_timestamp,
  `rec_updated_by` bigint NOT NULL DEFAULT 1,
  `active_flag` boolean DEFAULT '1',
  
  primary key(`address_id`),
  foreign key(`user_id`) references user_information(`user_id`)
  );