## TASK

```
● Build an application that takes an input: an arrayof applicants and an array of team
members, and produces an output: an array of applicantswith their respective
compatibility score.
```
**SPECIFICATIONS**
● Input and Output must be in JSON
● Compatibility score for each applicant should fallin a range from [0, 1]
● Use any programming language you wish to develop in.

**INSTRUCTIONS**
● Upload completed project code to a public Github/Gitlab/Bitbucketrepository
● Provide instructions on how your solution takes input/generatesoutput in the
README.md of the repo
● Notify Datahouse by email when completed

**Sample Data**
Input:
{
“team” : [
{
“name” : “Eddie”,
“attributes” {
“intelligence” : 1,
“strength” : 5,
“endurance” : 3,
“spicyFoodTolerance” : 1
}
}, {
“name” : “Will”,
“attributes”: {
“intelligence” : 9,
“strength” : 4,
“endurance” : 1,
“spicyFoodTolerance” : 6
}
}, {
“name” : “Mike”,
“attributes”: {
“intelligence” : 3,
“strength” : 2,
“endurance” : 9,
“spicyFoodTolerance” : 5


## }

## }

## ],

“applicants” : [
{
“name” : “John”,
“attributes”: {
“intelligence” : 4,
“strength” : 5,
“endurance” : 2,
“spicyFoodTolerance” : 1
}
}, {
“name” : “Jane”
“attributes”: {,
“intelligence” : 7,
“strength” : 4,
“endurance” : 3,
“spicyFoodTolerance” : 2
}
}, {
“name” : “Joe”,
“attributes”: {
“intelligence” : 1,
“strength” : 1,
“endurance” : 1,
“spicyFoodTolerance” : 10
}
}
]
}

Output:

{
“scoredApplicants” : [
{
“name” : “John”,
“score” : 0.
}, {
“name” : “Jane”,
“score” : 0.
}, {
“name” : “Joe”,


“score” : 0.
}
]
}

## SOLUTION

The program starts off by creating a console windowthat gives your four options:

1. Add Team Member
2. Add Applicant
3. Calculate compatibility
4. Exit

Looking at the given sample output we see the compatibilityscore being a decimal
number in the tenths position. This made me thinkthat it is interpreted as a percentage.
Compatibility with the applicants with the team canbe scored like a rubric for grading an
assignment: out of 100. This must be modified to outof 1, as the client is requesting the grading
to be from 0 to 1.

If the applicant has a score of 100, it means thatthey are very compatible with the team
and a score of 0 would mean they are not compatibleat all. The applicant would be more
compatible the more similar they are to the team’saverage stat. I interpreted every stat from the
sample input from 1-10. To be more compatible, thedifference between applicant’s stat must be
smaller. The way I would be grading the compatibilityscore of each stat would be as follows.

```
Very Compatible
0-
```
```
Compatible
2-
```
```
Less
Compatible
4-
```
```
Not
Compatible
6-
```
```
Incredibly
Incompatible
8-
```
```
Score
Unavailable
```
```
intelligence .25 .20 .15 .10 .5 0
```
```
strength .25 .20 .15 .10 .5 0
```
```
endurance .25 .20 .15 .10 .5 0
```
```
spicyFoodTolerance .25 .20 .15 .10 .5 0
```
To calculate the overall score of compatibility weadd your individual score of intelligence,
strength, endurance, and spicy food tolerance togetherand then grade it from 0-100.
● .8 - 1 means the applicant is **very compatible**.
● .6 - .79 means the applicant is **compatible**.
● .4 -.59 means the applicant is less compatible **lesscompatible**.
● .2 - .39 means the applicant is **not compatible**.
● .1 - .19 means the applicant is incredibly incompatible **incredibly incompatible**.


```
● If you have 0 your score is unavailable or 0.
```
For example
● The average intelligence of the team is (1+9+3) /3 = 4.
● The applicant John has an intelligence of 4
○ Since John has an intelligence 4 and 4 is .33 pointsless than the average, John
would be very compatible as the difference betweenhis score and the team
average is less than 2.
○ This would award John .25 compatibility points.

Conclusion:

```
● We are building an array of team members by the usercreating a new member object
and then setting it’s parameters up and then storingthat new member in the array of
members.
● We are also building the array of applicants the sameway, except the applicant’s require
their own parameter for average which is needed fortheir individual compatibility.
● We can calculate the compatibility by comparing thedifference between the applicant’s
stats and the team’s stats. The size of this differenceis what determines the strength of
the compatibility.
```
**PERSONAL NOTES**
Team averages from sample input:
● intelligence 4.
● strength 3.
● endurance 4.
● spicyFoodTolerance 4

Improvements that can be made:
● To improve storage solution -> implement ArrayListand ADT vs fixed size arrays in Java
● To improve input convenience and efficiency -> implementreading of spread sheet or file
for team member or applicant data input.
