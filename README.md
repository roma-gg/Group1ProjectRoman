Hi Group!

This project is created to practice using git and git commands, and solving java practice tasks at the same time.
Please ensure you watched git course videos, if you watching short videos - ensure you watched up to Git CommandLine block at least.

Classes and tasks: we will have packages with your names and classes inside it, which will contain your solutions of tasks you will receive. Methods (solutions) 
should be static so it can be called in Main method without creating an object. Important: please solve your task at CodingBat first to ensure you passed all test cases there.

Branches strategy: In this project we have 2 main branches: master and develop. If you watched git course videos you already know that each of you will 
have your own branch where you will write your code, after that you will merge your branch (branch with your name) and develop branch.

The only class all group will work in - will be Main class.

Practice tasks and test cases: after you solved your task (created static custom method) - use 3 test cases from coding bat to create test cases in Main class in the following format:

        // String-3 > countYZ (Roman)             -- comment with name of the task from CodingBat and student's name;
        System.out.println("String-3 > countYZ (Roman)");

        System.out.println("Test case 1:");
        System.out.println(PracticeTasks.countYZ("fez day") == 2);

        System.out.println("Test case 2:");
        System.out.println(PracticeTasks.countYZ("day fez") == 2);

        System.out.println("Test case 3:");
        System.out.println(PracticeTasks.countYZ("day fyyyz") == 2);

Ensure you will print boolean expression (true/false) even if your method returning non-boolean value, so the rest of the team can execute main method and see output of your solution.

Every time you will merge your branch with develop branch - I will check it and will merge develop branch with master branch to ensure that master branch.

Be carefull with actions you perform, but it's not a big deal as finding a way to fix the problem is also a good experience.
