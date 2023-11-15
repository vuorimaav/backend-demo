## A demo back end application

***

### Prerequisites

* Install Docker if not already available.
    * Run `docker --version` to see if it is already available.
    * If it isn't [see Docker installation instructions.](https://docs.docker.com/get-docker/)
* Install Docker compose.
    * Run `docker-compose --version` to see if it's already there.
    * [Docker Compose installation instructions are here.](https://docs.docker.com/compose/install/)
* Save database password to environment variable `DB_PASSWD`
  * `echo $DB_PASSWD` should print the password of it is s et up correctly
  * dotenv (`.env`) is a handy helper for this. See [dotenv on Github.](https://github.com/motdotla/dotenv) 

### Start the app

* Start the Postgres database by typing `docker-compose up -d`
    * There's a default password inside the `docker-compose.yml` file and hence is only intended for local development
      purposes.
* Start the application by typing `./gradlew bootRun`

The back end will be available at http://localhost:8080

