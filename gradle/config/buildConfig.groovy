binaryRepository {
url = 'http://mycompany.bin.repo:8081/artifactory'
username = 'admin'
password = 'password'
name = 'libs-release-local'
}

environments {
	test {
		server {
		hostname = 'localhost'
		port = 8082
		context = appName
		username = 'tomcat'
		password = 's3cret'
		homeDir='/apache/apache-tomcat-8.0.18-dev'
		}
	}
	uat {
		server {
		hostname = 'localhost'
		port = 8082
		context = appName
		username = 'tomcat'
		password = 's3cret'
		homeDir='/apache/apache-tomcat-8.0.18-dev'
		}
	}
}