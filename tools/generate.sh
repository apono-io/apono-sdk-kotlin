#!/usr/bin/env bash

export OPENAPI_GENERATOR_VERSION=6.5.0

PROJECT_ROOT=$(dirname "$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")")

echo "Project root: ${PROJECT_ROOT}"

export JAVA_POST_PROCESS_FILE=""

openapi-generator-cli version
exec openapi-generator-cli generate \
  --generator-name kotlin \
  --input-spec api/openapi.json \
  --git-user-id apono-io \
  --git-repo-id apono-sdk-kotlin \
  --http-user-agent apono-sdk-kotlin/0.1.0 \
  --output "$PROJECT_ROOT" \
  --config "$PROJECT_ROOT/config.yaml"
