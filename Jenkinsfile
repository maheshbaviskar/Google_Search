node {
   def mvnHome
   stage('Preparation') { 
      mvnHome = 'C:\\apache-maven-3.5.2'
   }
   stage('Build') {
      
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
		 
         echo 'testng
      }
   }

}