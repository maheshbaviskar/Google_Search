pipeline {
    agent any
    stages {
        stage('Compile Stage') 
		{
		
		
            steps {
                withMaven(maven : 'maven-3.5.2')
				{
				sh 'mvn clean compile'
				}
			}
		
		}
	}
}