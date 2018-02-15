--Организации
insert into account(id, name_account, created) values (1, 'Alpha', TO_DATE('2017-01-01', 'yyyy-mm-dd'));
insert into account(id, name_account, created) values (2, 'Beta', TO_DATE('2017-01-02', 'yyyy-mm-dd'));
insert into account(id, name_account, created) values (3, 'Delta', TO_DATE('2017-01-03', 'yyyy-mm-dd'));
insert into account(id, name_account, created) values (4, 'Epsilon', TO_DATE('2017-01-04', 'yyyy-mm-dd'));
-------------------------------------------------------------------------
--Отчеты о прибылях и убытках
insert into income_report(report_id, account_id, version, status, created, period, year, row2110) values (10, 1, 1, 'Processing', TO_DATE('2017-04-01', 'yyyy-mm-dd'), 1, '2017', 3);
insert into income_report(report_id, account_id, version, status, created, period, year, row2110, row2120) values (11, 1, 2, 'Completed', TO_DATE('2017-04-02', 'yyyy-mm-dd'), 1, '2017', 3, 3);

insert into income_report(report_id, account_id, version, status, period, year, row2110) values (13, 2, 1, 'Processing', 1, '2017', 3);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (15, 2, 2, 'Completed', 1, '2017', 4, 4);

insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (17, 3, 1, 'Processing', 2, '2017', 4, 4);
insert into income_report(report_id, account_id, version, status, period, year, row2110, row2120) values (18, 3, 2, 'Completed', 2, '2017', 5, 5);

insert into income_report(report_id, account_id, version, status, created, period, year, row2110, row2120) values (20, 4, 1, 'Processing', TO_DATE('2017-04-02', 'yyyy-mm-dd'), 1, '2017', 3, 3);
insert into income_report(report_id, account_id, version, status, created, period, year, row2110, row2120, row2100, row2210, row2220, row2200, row2310, row2320, row2330, row2340, row2350, row2300, row2410, row2421, row2430, row2450, row2460, row2400) values (21, 4, 2, 'Completed', TO_DATE('2017-04-03', 'yyyy-mm-dd'), 1, '2017', 54, 4, 50, 5, 5, 40, 5, 5, 5, 5, 5, 45, 5, 0, 5, 5, 5, 35);
-------------------------------------------------------------------------
--Балансы
insert into balance(balance_id, account_id, version, status, period, year, row1110) values (10, 1, 1, 'Processing', 1, '2017', 3);
insert into balance(balance_id, account_id, version, status, period, year, row1110, row1120) values (11, 1, 2, 'Completed', 1, '2017', 3, 3);

insert into balance(balance_id, account_id, version, status, period, year, row1110) values (13, 2, 1, 'Processing', 1, '2017', 3);
insert into balance(balance_id, account_id, version, status, period, year, row1110, row1120) values (15, 2, 2, 'Completed', 1, '2017', 4, 4);

insert into balance(balance_id, account_id, version, status, period, year, row1110, row1120) values (17, 3, 1, 'Processing', 2, '2017', 4, 4);
insert into balance(balance_id, account_id, version, status, period, year, row1110, row1120) values (18, 3, 2, 'Completed', 2, '2017', 5, 5);

insert into balance(balance_id, account_id, version, status, created, period, year, row1110, row1120) values (20, 4, 1, 'Processing', TO_DATE('2017-04-02', 'yyyy-mm-dd'), 1, '2017', 3, 3);
insert into balance(balance_id, account_id, version, status, created, period, year, row1110, row1120, row1130, row1140, row1150, row1160, row1170, row1180, row1190, row1100, row1210, row1220, row1230, row1240, row1250, row1260, row1200, row1600, row1310, row1320, row1340, row1350, row1360, row1370, row1300, row1410, row1420, row1430, row1450, row1400, row1510, row1520, row1530, row1540, row1550, row1500, row1700) values (21, 4, 2, 'Completed', TO_DATE('2017-04-03', 'yyyy-mm-dd'), 1, '2017', 5, 5, 5, 5, 5, 5, 5, 5, 5, 45,10, 10, 10, 10, 10, 10, 60, 105, 10, 10, 10, 10, 10, 10, 40, 10, 10, 10, 10, 40,5, 5, 5, 5, 5, 25, 105);