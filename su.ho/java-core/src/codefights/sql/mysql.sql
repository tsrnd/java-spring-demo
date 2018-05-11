CREATE PROCEDURE projectList()
BEGIN
	select project_name, team_lead, income from Projects;
END



CREATE PROCEDURE countriesSelection()
BEGIN
	select * from countries where continent = "Africa";
END



CREATE PROCEDURE monthlyScholarships()
BEGIN
	select id, scholarship / 12 as scholarship from scholarships;
END



CREATE PROCEDURE projectsTeam()
BEGIN
	select distinct name from projectLog order by name;
END



CREATE PROCEDURE automaticNotifications()
BEGIN
    SELECT email
    FROM users
    WHERE role not in ("admin", "premium")

    ORDER BY email;
END



CREATE PROCEDURE volleyballResults()
BEGIN
	select * from results order by wins;
END



CREATE PROCEDURE mostExpensive()
BEGIN
	select name from Products order by price * quantity desc, name asc limit 1;
END



CREATE PROCEDURE gradeDistribution()
BEGIN
	select t.Name, t.ID from (select Name, ID, (0.25*Midterm1 + 0.25*Midterm2 + 0.5*Final) as op1, (0.5*Midterm1 + 0.5*Midterm2) as op2, (Final) as op3 from Grades) as t where t.op3 > t.op1 and t.op3 > t.op2 order by left(t.Name, 3), t.ID;
END



CREATE PROCEDURE mischievousNephews()
BEGIN
	select (WEEKDAY(mischief_date)) as weekday, mischief_date, author, title from mischief order by weekday, author = "Louie", author = "Dewey", author = "Huey", mischief_date, title;
END



