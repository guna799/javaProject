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
                expression
                {
                    return params.ENVIRONMENT='PROD'
                }
            steps
            {
                echo"---------------------------------"
                echo"Deployig to the production "
                echo "--------------------------------"
            }
            }
            
        }
    }
}