pipeline
{
    agent any
    {
        global="this is global varible"
    }
    stages
    {
        stage("demo")
        {
            env_stg="this is stge varible in the demo stage"
            steps
            {
                echo 'this is demo stage'
                echo "$env_stg"
                echo "$global"
            }        
        }
    }
}
