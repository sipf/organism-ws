Pour insérer un organisme:

    cd ./src/test/resources/
    curl --user admin:password -H "Content-Type: application/json" --data @organism.json http://localhost:8080/organisms
    
Pour insérer une mission:

    curl --user admin:password -H "Content-Type: application/json" --data @mission.json http://localhost:8080/missions


Pour consulter la DB

    http://localhost:8080/h2-console
    URL de la db: jdbc:h2:mem:testdb