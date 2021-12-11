select * from jaegers;

select * from jaegers
where status != 'Destroyed';

select * from jaegers
where mark = 'Mark-1' or mark = 'Mark-5';

select * from jaegers
order by mark;

select * from jaegers
where launch = (select max(launch) from jaegers);

select * from jaegers
where kaijukill = (select max(kaijukill) from jaegers) or kaijukill = (select min(kaijukill) from jaegers);

select avg(weight) from jaegers;

update jaegers set kaijukill = kaijukill + 1
where status = 'Active';

delete from jaegers
where status = 'Destroyed';
