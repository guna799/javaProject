properties([parameters([booleanParam('if'), choice(choices: ['equal ', 'less', 'more'], name: 'Choices')])])
pipeline
{
    agent admin
    stages
    {
        stage("boolean")
        {
            steps
            {
                echo 'this is boolean parameters'
                echo 'this code is form git'
                echo "${if}"
            }
        }
        stage("choice")
        {
            steps
            {
                ehco ' this is form choice parameters'
                echo "${Choices}
            }
        }
    }
}