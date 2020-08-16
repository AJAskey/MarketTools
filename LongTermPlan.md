# Long Term Plan for MarketTools
I am retired and have plenty of time to move the existing MarketTools into a full stack Java project. I am looking for teamates to share the open source work and possibly share in future revenue generated from the completed project.

My plan is to create a full stack Java application running on an AWS server.

# Notional Architecture
This architecture is a "stream of consciousness" for long term planning.

## Front End
The plan is to provide users with a Spring web based method of querying data which is returned to the web browser.

## Back End
The Back End will consist of the existing Java code re-structured to a Spring back-end technology.

### APIs
The visiable APIs of the back-end will be handled here using a Spring API technology.

### Database
The database will be hidden from users but will be accessed using front-end and back-end calls to a Spring technology.

Access to the database is the component that will be sold once complete.

# Moving to Freely Available Data
The plan assumes data to the SEC in financial XML format (XBRL) will continue to be available.
A tool is planned to constantly download and read this XBRL for all companies and populate an AWS database.

## Costs
- The plan is to create a GoFundMe (or similar) page to pay for AWS and other data/tools necessary to run the project.
- It is expected the cost per year during development will be around $2,500.

## Availability
The plan is to continue with the Apache 2.0 license to make the project available to anyone who can set it up and run it.

- The plan is considering charging users for access to the completely functional AWS server created during development.
- The plan is to provide any "team member" with free access to the completed AWS server and possibly a cut of future business activity.
- The plan will consider funds donated to the GoFundMe (or similar) page as future payment for access to the final AWS project.
- The cost for use of the completed AWS server will require a marketing effort with no direct relationship to cost of development.
