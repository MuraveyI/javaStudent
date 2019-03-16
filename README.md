# javaStudent
java exercises of a newbie

Warning!
Codes in this repository (definitely) maybe (absolutely) painfully dirty.
I am open to advices on how to write cleaner code.

Goals of this repository:
* Keep myself motivated to practice Java regularly
* Get familiar with Git and CLI to be better prepared for work environment

Helpful resources:
* [Git]( https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html )
* [Java]( https://stepik.org/course/6858/syllabus )
* [Markup?]( http://lmgtfy.com/?s=d&q=how+to+markup+.md+file )

Warning!
Mind your eyes for typos (especially in commit messages)

My coding style ( in codes written in later than 13 March 2019 ) :
1. Force braces {} to new line.
2. Always force braces: always	`if (condition) {statement}`
						never	`if (condition) statement`
3. camelCase
4. S P A C E S for everywhere

`
if ( numberGivenByUser % 2 != 0 )
{
    System.out.print( "Given number is odd" + "\n" );
}
else
{
	if ( numberGivenByUser % 5 == 0 )
	{
	    System.out.print( "Given number is divisible by 10" + "\n" );
	}
	
	System.out.print("Given number ends with 2, 4, 6 or 8 \n");
}
`
