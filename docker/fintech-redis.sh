docker network create redis-net

docker run --name fintech-redis \
             -d -p 6380:6379 \
             --network redis-net \
             redis:latest
