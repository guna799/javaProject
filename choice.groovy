properties([parameters([booleanParam(defaultValue: true, name: 'if'), choice(choices: ['equal ', 'less', 'more'], name: 'Choices')])])
pipeline
{
    agent any
    stages
    {
        stage("boolean")
        {
            steps
            {
                echo 'this is boolean parameters'
                echo 'this code is form git'
                if(isFoo.toBoolean())
                {
                    echo " if block is working"
                }
                
            }
        }
        stage("choice")
        {
            steps
            {
                echo ' this is form choice parameters'
                echo "${Choices}"
            }
        }
    }
}