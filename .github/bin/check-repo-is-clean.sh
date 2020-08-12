#!/usr/bin/env sh

if [ -n "$(git status --untracked-files=no --porcelain)" ]; then
  echo "Generated code is stale, please commit them!"
  exit 1
fi