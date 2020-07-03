Java tools for processing market and economic data.

This set of tools reads many years in Stock Investor Pro data and converts to a common DB format.

This DB can be read back into memory to be used generating reports on the fundamental data.

I work on the code using Eclipse. But feel free to create your own environment and uploaded the configuration files and Readme here.

A couple tools find useful to work with this github repository:

<<<<<<< dev
* https://tortoisesvn.net
* https://winmerge.org

## What works now:
* Parsing SIP data files and writing DB text, binary, and big binary.
* Reading DB text, binary, and big binary files.
* CompanySummary lists for each year and quarter.
* CompanyDerived reads DB files and calculates derived data from these (example PE, Margin, ROE)

## In progress now
* IndexDerived. Create your own index or use SP500 index to calculate a number of metrics, such as weighted earnings of index.

## Up next
* Report to write Zombie companies from the CompanyDerived class. 

## Tools I find useful working this project
* https://tortoisesvn.net
* https://winmerge.org/?lang=en


#Status 

A work in progress. Constant updates...

Master <-- Dev on 03-Jul-2020 12:15MT