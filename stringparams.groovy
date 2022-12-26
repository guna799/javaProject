pipeline
{
    agent any
    stages
    {
        stage("string")
        {
            steps
            {
                properties([
                    parameters([
                        string(
                            defaultValue:"this is guna",
                            name :"string parameter"
                        )
                    ])
                    
                ])
            }
        }
    }
}