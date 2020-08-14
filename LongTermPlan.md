# Long Term Plan for MarketTools
I am retired and have plenty of time to move the existing MarketTools into a full stack Java project.
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

# Moving to Freely Available Data
The plan assumes data to the SEC in financial XML format (XBRL) will continue to be available.
A tool is planned to constantly download and read this XBRL for all companies and populate an AWS database.
