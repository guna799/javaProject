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
            if(isFoo.toString()=='true'
                {
                      echo " if block is working"
                      echo 'this is boolean parameters'
                      echo 'this code is form git'
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