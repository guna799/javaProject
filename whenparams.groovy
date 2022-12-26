properties([parameters([choice(choices: ['TEST', 'PROD', 'DEPLOY', 'BUILD'], name: 'Choice')])])
pipeline
{
    agent any
    stages
    {
        stage("DeploytoProduction")
        {
        when
            {
                buildingTag()
            }
            steps
            {
                    echo "when condition in pipeline script"
            }
        }
            
        }
    }