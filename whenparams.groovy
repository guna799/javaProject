pipeline
{
    agent any
    stages
    {
        stage("DeploytoProduction")
        {
        when
            {
                equals(actual: currentBuild.number,expected:12)
            }
            steps
            {
                    echo "when condition in pipeline script"
            }
        }
            
    }
}