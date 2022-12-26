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