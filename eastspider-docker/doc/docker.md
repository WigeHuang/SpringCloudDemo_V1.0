# docker #


## usages ##

start services of zalenium and postgres:

    cd src/east

run initialization once:

    make init

then, next time, only:

    make up_services

then docker images will be pulled down automatically, services up.

To check the status of those docker containers:

    make ps

    make logs

To check postgres with Adminer, go to <http://localhost:8083/> in the browser,
fill in details:

    System: PostgreSQL
    Server: db
    Username: scraper
    Password: 68368
    Database: east

To check zalenium, go to <http://localhost:4445/grid/admin/live> in the browser.

Uses the server name instead of `localhost` if the docker containers are on a
server.
