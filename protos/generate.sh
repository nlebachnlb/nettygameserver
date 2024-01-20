protoc -I=. --java_out=../src/main/java cmd-schemas.proto
protoc -I=. --java_out=../src/main/java msg-schemas.proto
protoc -I=. --java_out=../src/main/java generic.proto