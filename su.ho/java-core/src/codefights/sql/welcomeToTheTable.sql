/*Please add ; after each select statement*/
CREATE PROCEDURE projectList()
BEGIN
	SELECT project_name, team_lead, income
    FROM Projects;
END

/*Please add ; after each select statement*/
CREATE PROCEDURE countriesSelection()
BEGIN
	select * from countries where continent = "Africa";
END