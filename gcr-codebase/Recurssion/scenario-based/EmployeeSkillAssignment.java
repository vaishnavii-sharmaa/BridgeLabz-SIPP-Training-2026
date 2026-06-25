public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int target,
            int index,
            String team,
            int currentSum) {

        if (currentSum == target) {

            System.out.println(
                    "[" + team + "]");
            return;
        }

        if (index == skills.length
                || currentSum > target) {

            return;
        }

        String newTeam;

        if (team.isEmpty()) {

            newTeam =
                    String.valueOf(skills[index]);

        } else {

            newTeam =
                    team + "," + skills[index];
        }

        findTeams(
                skills,
                target,
                index + 1,
                newTeam,
                currentSum + skills[index]);

        findTeams(
                skills,
                target,
                index + 1,
                team,
                currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};

        int target = 10;

        findTeams(
                skills,
                target,
                0,
                "",
                0);
    }
}
