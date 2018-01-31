# Auto2018
_This code is designed with the soul purpose of running autonomous for the robot_

<pre>
-------------------------------------------------------------------------		  
|      / |   |  |    |                              |  	 |	|	|\		|		  |
|     /  | R |  | RI |                              | LI |	| L | \		|		  |
|    /   |   |  |    |                              | 	 |	|   |  \	|		  |
|   /    -----  ------                               -----	-----	\	|		  |
|  /                                                 				 \	|		  |
| /                                                  				  \ |		  |
|/                                                  				   \|		  |
|                                                   				    |		  |
|                                                   				    |		  |
|- - -X- - X- - - -X - - - - - - - - - - - - - - - - - X - - - X - X - -|	<-----|Row 1 
|                             ---------                				    |		  |
|                             |       |              					|		  |
|                             |       |              					|		  |
|                             |       |               					|		  |
|           ----------------------------------------------				|		  |
|           |                      |                   	 |				|		  |
|           |                      |                   	 |				|		  |
|           |                      |                   	 |				|		  |
|           |                      |                  	 |				|		  |
|           ----------------------------------------------				|		  |
| - - - - - - - - - - X - - - - - - - - - - - - - X - - - - - - - - - - |	<-----|Switch Placement Position
|                                                   					|		  |
|                                                   					|		  |
|                                                   					|		  |
|- - -X - - - - - - - X - - - - - - - - - - - - - X - - - - - - - X - - |	<-----|Row 2
|                                                   					|		  |
|                                                   					|		  |
|                                                   					|		  |
|       ------------------------------------------------------			|		  |
|       |                          |                  		 |			|		  |
|       |                          |                  		 |			|		  |
|       |                          |                  		 |			|		  |
|- -X - |                          |                  		 |- X - - - |	<-----|Scale Placement Position
|       |                          |                  		 |			|		  |
|       |                          |                  		 |			|		  |
-------------------------------------------------------------------------
</pre>

## The General Movement Procedure
1. Drive to Row 1
2. Drive to ends of row 1
3. Drive to Row 2
4. Align to Switch Placement Position, on Row 2
5. Move to Switch Placement Position
6. _Place CUBE_
7. Move to Row 2
8. Align to Scale Place Position on Row 2
9. Move to Scale Place Position
10. _Place CUBE_ 
