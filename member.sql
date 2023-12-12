use member;

create table member_join (
memberId int not null auto_increment,
memberEmail varchar(50) not null,
memberPasswd varchar(20) not null,
memberName varchar(6) not null,
memberPhone varchar(11) not null,
memberNickName varchar(10) not null,
memberBirth DATE, -- yyyy-MM-dd형식으로 8자 받을거임.
memberPostcode varchar(10),
memberAddress varchar(60),
memberDetailAddress varchar(60),
memberExtraAddress varchar(60),
memberInterest varchar(50),
regdate date,
memberPoint bigint,
memberRole varchar(10),
primary key(memberId)
);

INSERT INTO