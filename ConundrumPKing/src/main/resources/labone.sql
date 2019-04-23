use luolabone;


alter table answer modify column an_date varchar(100);

alter table answer modify column an_date varchar(100);

alter table conundrum modify column con_date  varchar(100);


alter table publish modify column date varchar(100);

select * from conundrum

drop table account;

drop table `student_account`;

create table `student_account`(
  `count` INTEGER auto_increment,
  `username` varchar(100) ,
  `password` varchar(100) ,
  primary key (`count`),
  FOREIGN KEY (`username`) REFERENCES student(`stu_id`)
    on DELETE cascade
    on update cascade
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

drop table `instructor_account`;

create table `instructor_account`(
  `count` INTEGER auto_increment,
  `username` varchar(100) ,
  `password` varchar(100) ,
  primary key (`count`),
  FOREIGN KEY (`username`) REFERENCES instructor(`in_id`)
    on delete cascade
    on update cascade
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP table `answer`;

create table `answer`(
  `in_id` varchar(200),
  `con_id` varchar(200),
  `an_date` varchar(100),
  `an_content` varchar(1024),
  foreign key (`in_id`) references instructor(`in_id`)
    on delete cascade
    on update cascade,
  foreign key (`con_id`) references conundrum(`con_id`)
    on delete cascade
    on update cascade
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

drop table `publish`;

create table `publish`(
  `stu_id` varchar(200),
  `con_id` varchar(200),
  `date` varchar(100),
  foreign key (`stu_id`) references student(`stu_id`)
    on delete cascade
    on update cascade,
  foreign key (`con_id`) references conundrum(`con_id`)
    on delete cascade
    on update cascade
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;


drop  table `rank`;

create table `rank`(
  `rank_id` int(11) auto_increment,
  `in_id` varchar(200),
  `in_name` varchar(256),
  `in_department` varchar(256),
  `in_course` varchar(256),
  primary key (`rank_id`),
  foreign key (`in_id`) references instructor(`in_id`)
    on delete cascade
    on update cascade
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

























