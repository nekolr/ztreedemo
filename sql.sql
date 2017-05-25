create database emp;

create table `department` (
	`deptid` bigint (20),
	`deptname` varchar (120),
	`layer` smallint (2),
	`parentid` bigint (20),
	`layorder` varchar (120)
);

insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000001','研发部','1','0','a10000001');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000002','研发一部','2','10000001','a10000001b10000002');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000003','研发二部','2','10000001','a10000001b10000003');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000010','研发三部','2','10000001','a10000001b10000010');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000011','运营部','1','0','a10000011');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000012','测试部','1','0','a10000012');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000013','运营一部','2','10000011','a10000011b10000013');
insert into `department` (`deptid`, `deptname`, `layer`, `parentid`, `layorder`) values('10000014','测试一部','2','10000012','a10000012b10000014');
