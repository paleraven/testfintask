insert into account(id, name_account) values (1, 'Alpha');
insert into account(id, name_account) values (2, 'Beta');
insert into account(id, name_account) values (3, 'Delta');

insert into income_report(report_id, account_id, version, status, period, year, row2110) values (10, 1, 1, 'Processing', 1, '2017', 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (11, 1, 2, 'Completed', 1, '2017', 3, 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (12, 1, 1, 'Completed', 2, '2017', 4, 4);

insert into income_report(report_id, account_id, version, status, period, year, row2110) values (13, 2, 1, 'Processing', 1, '2017', 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (14, 2, 2, 'Processing', 1, '2017', 3, 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (15, 2, 3, 'Completed', 1, '2017', 4, 4);

insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (16, 3, 1, 'Completed', 1, '2017', 3, 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (17, 3, 1, 'Completed', 2, '2017', 4, 4);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (18, 3, 1, 'Completed', 3, '2017', 5, 5);