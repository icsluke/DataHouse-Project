<p>
<strong>SOLUTION</strong>
</p>
<p>
<strong>	</strong>
</p>
<p>
The program starts off by creating a console window that gives your four options:
</p>
<ol>

<li>Add Team Member

<li>Add Applicant

<li>Calculate compatibility

<li>Exit
</li>
</ol>
<p>
Looking at the given sample output we see the compatibility score being a decimal number in the tenths position. This made me think that it is interpreted as a percentage. Compatibility with the applicants with the team can be scored like a rubric for grading an assignment: out of 100. This must be modified to out of 1, as the client is requesting the grading to be from 0 to 1.
</p>
<p>
If the applicant has a score of 100, it means that they are very compatible with the team and a score of 0 would mean they are not compatible at all. The applicant would be more compatible the more similar they are to the team’s average stat. I interpreted every stat from the sample input from 1-10. To be more compatible, the difference between applicant’s stat must be smaller. The way I would be grading the compatibility score of each stat would be as follows.
</p>

<table>
  <tr>
   <td>
   </td>
   <td>Very Compatible
<p>
0-2
   </td>
   <td>Compatible
<p>
2-4
   </td>
   <td>Less Compatible
<p>
4-6
   </td>
   <td>Not Compatible
<p>
6-8
   </td>
   <td>Incredibly Incompatible
<p>
8-10
   </td>
   <td>Score Unavailable
   </td>
  </tr>
  <tr>
   <td>intelligence
   </td>
   <td>.25
   </td>
   <td>.20
   </td>
   <td>.15
   </td>
   <td>.10
   </td>
   <td>.5
   </td>
   <td>0
   </td>
  </tr>
  <tr>
   <td>strength
   </td>
   <td>.25
   </td>
   <td>.20
   </td>
   <td>.15
   </td>
   <td>.10
   </td>
   <td>.5
   </td>
   <td>0
   </td>
  </tr>
  <tr>
   <td>endurance
   </td>
   <td>.25
   </td>
   <td>.20
   </td>
   <td>.15
   </td>
   <td>.10
   </td>
   <td>.5
   </td>
   <td>0
   </td>
  </tr>
  <tr>
   <td>spicyFoodTolerance
   </td>
   <td>.25
   </td>
   <td>.20
   </td>
   <td>.15
   </td>
   <td>.10
   </td>
   <td>.5
   </td>
   <td>0
   </td>
  </tr>
</table>


<p>
To calculate the overall score of compatibility we add your individual score of intelligence, strength, endurance, and spicy food tolerance together and then grade it from 0-100.
</p>
<ul>

<li>.8 - 1 means the applicant is <strong>very compatible</strong>.

<li>.6 - .79 means the applicant is <strong>compatible</strong>.

<li>.4 -.59 means the applicant is less compatible<strong> less compatible</strong>.

<li>.2 - .39 means the applicant is <strong>not compatible</strong>.

<li>.01 - .19 means the applicant is incredibly incompatible<strong> incredibly incompatible</strong>.

<li>If you have 0 your score is <strong>unavailable or 0</strong>.
</li>
</ul>
<p>
For example
</p>
<ul>

<li>The average intelligence of the team is (1+9+3) / 3 = 4.33

<li>The applicant John has an intelligence of 4  
<ul>
 
<li>Since John has an intelligence 4 and 4 is .33 points less than the average, John would be very compatible as the difference between his score and the team average is less than 2. 
 
<li>This would award John .25 compatibility points.
</li> 
</ul>
</li> 
</ul>

<p>
To properly perform these steps the code:
</p>
<ol>
  <li>Created a class for team members and applicants.</li>
  <li>Created a new object for team member or applicant in an array of team members or applicants with the inputted stats.</li>
  <li>After all team member objects and applicant objects have been stored in their respective object array we calculate the average of each stat for the team member. This is done by iterating over the array of team members. The team has an average for each stat which will be used to generate the values needed to calculate applicant's compatibility. </li>
  <li>Iterate over the array of applicants to calculate their individual compatibility scores. Calculate the applicant's individual compatibility score by subtacting the applicant's individual stat from the team average individual stat. This difference is extracted as an absolute value to account for if the difference is above or below the average. It also removes negatives and makes the math and comparisons cleaner.</li>
  <li>The main compatibility score of the applicant is calculated by adding the individual compatibility scores together. This main compatibility score is shown with each applicant added.</li>
</ol>

<p>
Conclusion:
</p>
<ul>

<li>We are building an array of team members by the user creating a new member object and then setting it’s parameters up and then storing that new member in the array of members.

<li>We are also building the array of applicants the same way, except the applicant’s require their own parameter for average which is needed for their individual compatibility.

<li>We can calculate the compatibility by comparing the difference between the applicant’s stats and the team’s stats. The size of this difference is what determines the strength of the compatibility.
</li>
</ul>
<p>
<strong>PERSONAL NOTES</strong>
</p>
<p>
Team averages from sample input: 
</p>
<ul>

<li>intelligence 4.33

<li>strength 3.66

<li>endurance 4.33

<li>spicyFoodTolerance 4
</li>
</ul>
<p>
Improvements that can be made:
</p>
<ul>

<li>To improve storage solution -> implement ArrayList and ADT vs fixed size arrays in Java

<li>To improve input convenience and efficiency -> implement reading of spread sheet or file for team member or applicant data input.
</li>
</ul>
