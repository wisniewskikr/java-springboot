PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker with Kubernetes

##### Preconditions - Actions
* Download Source Code with `git clone https://github.com/wisniewskikr/java-springboot.git`
* Launch Docker tool on your local machine
* Create lockal domain: open file **Widnows -> System32 -> drivers -> etc -> hosts** and add there new domain **127.0.0.1 example.net**

USAGE
-----

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build Text image with `docker build -t localhost:5000/custom-text-image ./custom-text-service`
4. Push Docker Text image to local registry with `docker push localhost:5000/custom-text-image`
5. Build Greeting image with `docker build -t localhost:5000/custom-greeting-image ./custom-greeting-service`
6. Push Docker Greeting image to local registry with `docker push localhost:5000/custom-greeting-image`
7. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
8. Check deployment (optional)

    * Display list of deployments with `kubectl get deployments`
    * Display describe for specific deployment with `kubectl describe deployment greeting-deployment`
9. Check pod`s logs (optional)

    * Display list of pods with `kubectl get pods`
    * Display describe for specific pod with `kubectl describe pod <pod_id>`
    * Display log for specific pod with `kubectl logs <pod_id>`
10. Visit `http://localhost:31000`
11. Deploy traefik controller with `kubectl apply -f traefik.yml`
12. Check traefik controller (optional) with `kubectl get deploy -n kube-system`
13. Deploy ingress with `kubectl apply -f ingress.yml`
14. Check ingress (optional)

    * Display list of ingresses with `kubectl get ingress`
    * Display describe for specific ingress with `kubectl describe ingress greeting-ingress`
15. Visit `http://example.net`
16. Clean up environment:

    * Delete Kubernetes ingress with `kubectl delete ingress greeting-ingress`
    * Delete Kubernetes clusterrole with `kubectl delete clusterrole -n cube-system traefik-ingress-controller`
    * Delete Kubernetes clusterrolebinding with `kubectl delete clusterrolebinding -n cube-system traefik-ingress-controller`    
    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes service with `kubectl delete service text-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Delete Kubernetes deployment with `kubectl delete deployment text-deployment`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged Text image with `docker rmi localhost:5000/custom-text-image`
    * Remove tagged Greeting image with `docker rmi localhost:5000/custom-greeting-image`   
    * Remove registry image with `docker rmi registry:2`