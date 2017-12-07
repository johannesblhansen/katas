drop table AppUser;

create table AppUser (
  id INT,
  username varchar(100) not NULL,
  password varchar(200) not NULL,
  primary key (id),
  CONSTRAINT AppUser_Name_Unique UNIQUE (username)
);

drop table apple;

create table apple (
  id VARCHAR(200),
  appletype varchar(200)
);