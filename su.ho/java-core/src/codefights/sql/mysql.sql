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



    