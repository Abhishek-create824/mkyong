drop table RAW_REPORT if exists;
create table RAW_REPORT (RAW_REPORT_ID bigint generated by default as identity, DATE varchar(15) not null, IMPRESSIONS varchar(15) not null, CLICKS varchar(15) not null, EARNING varchar(15) not null, primary key (RAW_REPORT_ID));

--insert into RAW_REPORT(DATE,IMPRESSIONS,CLICKS,EARNING) values (:date, :impressions, :clicks, :earning)
