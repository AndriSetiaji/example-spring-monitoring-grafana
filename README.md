# example-spring-monitoring-grafana
![image](https://github.com/user-attachments/assets/224ac168-eee0-4998-9f17-2bf959bfb3bc)


### tech stack:
- java: example-app-svc ✔️
- prometheus: receiver log services ✔️
- open telemetry: collector trace and log ✔️
- grafana-tempo: managing trace ✔️
- grafana-loki: managing logs with trace ✔️
- grafana-grafana: dashboard and alerts ✔️


## how to run 
- need install first docker, docker compose, java 17
- run 'docker compose up'
- run ':bootRun' for java service
- test call api /hello on port 8080

## Note
- java service port is 8080
- grafaba port is 3000

## example running apps
![image](https://github.com/user-attachments/assets/6c556571-c24b-48b5-8fa6-a8bc06729988)

## example grafana
![image](https://github.com/user-attachments/assets/f9061ec2-53c6-421c-8da7-70eb401be3d7)x
