# Dockerイメージの指定
FROM mysql:8.0

# ポートの開放
EXPOSE 3306

# 設定ファイルのコピー
ADD ./mysql/config/my.cnf /etc/mysql/conf.d/my.cnf

# 実行コマンド
CMD ["mysqld"]