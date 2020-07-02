# MarketTools
Java tools for processing market and economic data.

This set of tools reads many years in Stock Investor Pro data and converts to a common DB format.

This DB can be read back into memory to be used generating reports on the fundamental data.

I work on the code using Eclipse. But feel free to create your own environment and uploaded the configuration files and Readme here.

A couple tools find useful to work with this github repository:

https://tortoisesvn.net

https://winmerge.org/?lang=en

##What works now:
* Parsing SIP data files and writing DB text, binary, and big binary.
* Reading DB tedt, binary, and big binary files.
* CompanySummary lists for each year and quarter.
* CompanyDerived reads DB files and calculates derived data from these (example PE, Margin, ROE)

##Inprogress now
* IndexDerived. Create and index or use SP500 to calculate a number of metrics, such as weighted earnings of index.

##Up next
* Report to find Zombie companies from the CompanyDerived class.

A work in progress. Constant updates...

Master <-- Dev on 29-Jun-2020 14:54MT
