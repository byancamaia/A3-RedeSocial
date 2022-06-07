# API <img align="center" alt="" height="35" width="60" src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png"> <img align="center" alt="" height="40" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"> <img align="center" height="35" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mongodb/mongodb-original.svg">


![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)


## ✔️ Técnicas e tecnologias utilizadas
- Java
- Spring Boot
- Maven
- MongoDB



## ✔️ Setup

- Instalar JDK 11.0.12
- Instalar Maven 3.3.9
- Instalar MongoDB

# Documentação das Rotas

## GET users (http://localhost:8080/users)


     {
        "id": "629f6818f793b37bebce3f5e",
        "name": "Maria Julia",
        "email": "maju@gmail.com",
        "senha": "maria"
    },
    {
        "id": "629f6818f793b37bebce3f5f",
        "name": "Gabriel Fernando",
        "email": "isagab@gmail.com",
        "senha": "gabriel"
    },
    {
        "id": "629f6818f793b37bebce3f60",
        "name": "Carlos Henrique",
        "email": "caique@gmail.com",
        "senha": "carlos"
    }
    
## GET posts (http://localhost:8080/posts)
     {
        "id": "629f6818f793b37bebce3f61",
        "date": "2022-03-21T00:00:00.000+00:00",
        "title": "Partiu Viagem!",
        "body": "Vou viajar para SP. Abraços!",
        "author": {
            "id": "629f6818f793b37bebce3f5e",
            "name": "Maria Julia"
        },
        "comments": [
            {
                "text": "Boa Viagem!",
                "date": "2022-03-21T00:00:00.000+00:00",
                "author": {
                    "id": "629f6818f793b37bebce3f5f",
                    "name": "Gabriel Fernando"
                }
            },
            {
                "text": "Aproveita!",
                "date": "2022-03-22T00:00:00.000+00:00",
                "author": {
                    "id": "629f6818f793b37bebce3f60",
                    "name": "Carlos Henrique"
                }
            }
        ]
    },
    {
        "id": "629f6818f793b37bebce3f62",
        "date": "2022-06-01T00:00:00.000+00:00",
        "title": "Bom dia!",
        "body": "Acordei Feliz Hoje!",
        "author": {
            "id": "629f6818f793b37bebce3f60",
            "name": "Carlos Henrique"
        },
        "comments": [
            {
                "text": "Tenha um ótimo dia!",
                "date": "2022-06-01T00:00:00.000+00:00",
                "author": {
                    "id": "629f6818f793b37bebce3f5f",
                    "name": "Gabriel Fernando"
                }
            }
        ]
    },
    {
        "id": "629f6818f793b37bebce3f63",
        "date": "2022-06-01T00:00:00.000+00:00",
        "title": "Boa Tarde!",
        "body": "Tenho que ir trabalhar!",
        "author": {
            "id": "629f6818f793b37bebce3f5f",
            "name": "Gabriel Fernando"
        },
        "comments": []
    }

## POST INSERT (http://localhost:8080/users)


    {
    "name":"Byanca Maia",
    "email":"byanca@gmail.com",
    "senha": "1$2k"
     }



## PUT UPDATE (http://localhost:8080/users/id)

    {
    "name":"Byanca Maia",
    "email":"byanca@gmail.com",
    "senha": "1$2k"
    }

  

## DELETE USER (http://localhost:8080/users/id)


