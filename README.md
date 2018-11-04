# Cloud-Computing
 
github link: https://github.com/Cathylan/Cloud-Computing-fall2018

 
Student

1. GET
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/student
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/student/1
 
2. POST
     http://lanlan.us-west-2.elasticbeanstalk.com/webapi/student
     body:
     {
        "courses": [
            “Database”,
            "Cloud Computing"
        ],
        "programName": "Information System",
        "studentImage": “mike.jpg",
        "studentName": “Mike”
    }

3.PUT
      http://lanlan.us-west-2.elasticbeanstalk.com/webapi/student/2
      body:
      {
           “studentName”: ”Lanlan”
       }
       
4.DELETE

    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/student/2


Professor

1. GET
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/professor
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/professor/1

2. POST
     http://lanlan.us-west-2.elasticbeanstalk.com/webapi/professor
     body:
     {
        “department": "Information System",
        "firstName": "Jami"

    }

3.PUT
      http://lanlan.us-west-2.elasticbeanstalk.com/webapi/professor/1
      body:
      {
        "department": "computer science",
        "firstName": "Sally"
       }
4.DELETE
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/professor/1


Course

1. GET
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/course
    http://lanlan.us-west-2.elasticbeanstalk.com/webapi/course/INFO6250

2. POST
     http://lanlan.us-west-2.elasticbeanstalk.com/webapi/course
     
     body:
     {
    "TA": {
        "studentName": "Jing"
    },
    "board": {
        "entry": [
            {
                "key": 1,
                "value": {
                    "associateMaterial": "Programming guide",
                    "lectureId": 1,
                    "lectureNotes": "Hello World"
                }
            }
        ]
    },
    "courseId": "csye6225",
    "enrolledStudent": {
        "entry": [
            {
                "key": 1,
                "value": {
                    "programName": "Information System",
                    "studentId": 1,
                    "studentImage": "Rose.jpg",
                    "studentName": "Rose"
                }
            },
            {
                "key": 2,
                "value": {
                    "programName": "Information System",
                    "studentId": 2,
                    "studentImage": "Lee.jpg",
                    "studentName": "Lee"
                }
            }
        ]
    },
    "lectures": {
        "associateMaterial": "Programming guide",
        "lectureId": 1,
        "lectureNotes": "Hello World"
    },
    "professor": {
        "department": "information systems",
        "firstName": "Jami",
        "professorId": 1
    },
    "roster": {
        "entry": [
            {
                "key": 1,
                "value": "Rose"
            },
            {
                "key": 2,
                "value": "Melody"
            },
            {
                "key": 3,
                "value": "David"
            }
        ]
    }
}
3.PUT
      http://lanlan.us-west-2.elasticbeanstalk.com/webapi/course/csye6225
      body:
     {
    "TA": {
        "studentName": “Jing Fu"
    },
    "board": {
        "entry": [
            {
                "key": 1,
                "value": {
                    "associateMaterial": "Programming guide",
                    "lectureId": 1,
                    "lectureNotes": "Hello World"
                }
            }
        ]
    },
    "courseId": "info6100",
    "enrolledStudent": {
        "entry": [
            {
                "key": 1,
                "value": {
                    "programName": "Information System",
                    "studentId": 1,
                    "studentImage": "Rose.jpg",
                    "studentName": "Rose"
                }
            },
            {
                "key": 2,
                "value": {
                    "programName": "Information System",
                    "studentId": 2,
                    "studentImage": "Lee.jpg",
                    "studentName": "Lee"
                }
            }
        ]
    },
    "lectures": {
        "associateMaterial": "Programming guide",
        "lectureId": 1,
        "lectureNotes": "Hello World"
    },
    "professor": {
        "department": "information systems",
        "firstName": "Jami",
        "professorId": 1
    },
    "roster": {
        "entry": [
            {
                "key": 1,
                "value": "Rose"
            },
            {
                "key": 2,
                "value": "Melody"
            },
            {
                "key": 3,
                "value": "David"
            }
        ]
    }
} 

4.DELETE: 
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/course/csye6225

Lecture
1. GET
   http://lanlan.us-west-2.elasticbeanstalk.com/webapi/lecture
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/lecture/1 
   
2. POST
     http://lanlan.us-west-2.elasticbeanstalk.com/webapi/lecture
     body:
     {
        "associateMaterial": "CC150",
        "lectureNotes": "Crack java"
    } 

3.PUT
     http://lanlan.us-west-2.elasticbeanstalk.com/webapi/lecture/1
      body:
      {
        "associateMaterial": "CC150",
        "lectureNotes": "Crack java"
    } 

4.DELETE
  http://lanlan.us-west-2.elasticbeanstalk.com/webapi/lecture/1 


Program

1. GET 
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/program
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/program/1

2. POST 

http://lanlan.us-west-2.elasticbeanstalk.com/webapi/program
body: 
{"programName":"information science",
	"courses":[
		{"courseId": "cloud computing"},
		{"courseId": "Database"}]
}

3. PUT 
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/program/1 

Body: 
{“programName”:"Electronic Engineer",
	"courses":[
		{"courseId": “digital"},
		{"courseId": “Database management"}]
}

4. Delete 
http://lanlan.us-west-2.elasticbeanstalk.com/webapi/program/1 


