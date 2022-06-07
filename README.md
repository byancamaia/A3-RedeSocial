# A3 Sistemas Distribuídos <img align="center" alt="" height="35" width="60" src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png"> <img align="center" alt="" height="40" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"> <img align="center" height="35" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mongodb/mongodb-original.svg">


![Badge em Desenvolvimento](https://img.shields.io/static/v1?label=STATUS&message=PRONTO&color=GREEN&style=for-the-badge)


## Nomes dos integrantes
- Adam Domingos Macedo Malos da Silva - 125111367543
- Byanca Maia - 125111378078
- Isaias Gabriel Vasco Gomes - 125111361971
- Jhone da Cruz Sousa - 125111369647
- Matheus de Freitas Tonietti - 125111351391
- Victor Aiexe Barreto do Valle - 125112362886


## ✔️ Como rodar o projeto?
A API possui duas partes, o back-end e o front-end. Para inicializa-lá, o primeiro passo é acessar o banco de dados, é preciso ter o MongoDB instalado em sua máquina. Após abrir o banco, inserir a seguinte URL "mongodb://localhost:27017/workshop-mongo", já tendo acesso ao banco de dados. Agora é necessário rodar o projeto back-end, onde ele insere as informações que precisamos no banco de dados. Só com essa parte, já podemos usar o PostMan para inserir, deletar, atualizar e mostrar na tela. Após o projeto iniciar sem erros, podemos iniciar a segunda parte, o front-end. Cujo nome é "Rede Social", para que ele rode, é necessário que o NodeJS esteja instalado, e inserir algumas configurações, como npm install -g @angular/cli e npm install moment. A seguir, é preciso iniciar um novo terminal e digitar "node server.js", o projeto já rodará. Agora basta abrir o http://localhost:3000/ que já podemos acessar o projeto com facilidade.

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


