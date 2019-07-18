up_services:
	docker-compose up -d

down_services:
	docker-compose down

ps:
	docker-compose ps

logs:
	docker-compose logs

init:
	docker pull elgalu/selenium

deploy:
	rsync -av ../east logan:/opt/proj/

.PHONY: up_services down_services init ps logs
