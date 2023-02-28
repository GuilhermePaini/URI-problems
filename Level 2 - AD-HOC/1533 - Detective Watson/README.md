<h4 align='center'>URI Online Judge | 1533</h4>
<h1 align='center'>Detective Watson - By  Cristhian Bonilha, Brazil</h1>

### Source: - [URI Online Judge-1533](https://www.beecrowd.com.br/judge/en/problems/view/1533)

<br>

<p style="text-align: justify">
Read a number and make a program which puts this number in the first position of an array N[10]. In each subsequent position, put the double of the previous position. For example, if the input number is 1, the array numbers ​​must be 1,2,4,8, and so on.
</p>


<p style="text-align: justify">
John Watson, after years working aside Sherlock Holmes, never understood how he was able to guess who was the killer so easily. On a certain night, however, Sherlock drunk so much that he told John what the secret was.
</p>

<p style="text-align: justify">
“Elementary dear Watson”, said Sherlock Holmes. “It is never the most suspicious, but the second most suspicious”. After he got the secret, John decided to solve a crime by his own, just to test if what Sherlock said made sense or it was just drunk talk.
</p>

<p style="text-align: justify">
Given a list with N integers, representing how much each person is suspect, help John Watson to decide who is the killer, according to the mentioned method.
</p>

## Input

<p style="text-align: justify">
There will be several test cases. Each test case starts with an integer N (2 ≤ N ≤ 1000), representing the number of suspects.
</p>

<p style="text-align: justify">
Following there will be N distinct integers, where the i-th integer, for each 1 ≤ i ≤ N, represents how much the i-th person is suspect, given John Watson's opinion. Be V the value of i-th integer, 1 ≤ V ≤ 10000.
</p>

<p style="text-align: justify">
The last test case is indicated when N = 0, which should not be processed.
</p>

## Output

<p style="text-align: justify">
For each test case print one line, containing one integer, representing the index of the killer, according to the mentioned method.
</p>

<br>

| Input Sample | Output Sample |
|:------------:|:-------------:|
|  3           | 1             |
|  3 5 2       | 4             |
|  5           |               |
|  1 15 3 5 2  |               |
|              |               |